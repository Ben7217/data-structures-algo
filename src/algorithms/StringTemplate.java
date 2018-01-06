package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.Collections.unmodifiableList;


class StringTemplate {

    private static final Pattern TAG_PATTERN = Pattern.compile("\\{([a-z.]+)}");
    private final List<String> tagKeys;
    private final List<String> inBetweenParts;


    public static void main(String[] args) {




    }



    StringTemplate(final String template) {
        final Matcher match = TAG_PATTERN.matcher(template);

        final List<String> keysFound = new ArrayList<>();
        final List<String> partsFound = new ArrayList<>();

        int endOfLast = 0;

        while (match.find()) {
            keysFound.add(match.group(1));
            partsFound.add(template.substring(endOfLast, match.start()));
            endOfLast = match.end();
        }

        if (template.length() > endOfLast) {
            partsFound.add(template.substring(endOfLast, template.length()));
        }

        this.tagKeys = unmodifiableList(keysFound);
        this.inBetweenParts = unmodifiableList(partsFound);
    }

    String render(final Function<String, String> valueReader) {
        final StringBuilder builder = new StringBuilder();

        for (int i = 0; i < inBetweenParts.size(); i++) {
            builder.append(inBetweenParts.get(i));

            if (tagKeys.size() > i) {
                builder.append(valueReader.apply(tagKeys.get(i)));
            }
        }

        return builder.toString();
    }
}