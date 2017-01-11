package test;

import org.junit.Assert;
import org.junit.Test;
import strings.CamelCase;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by a7mad on 11/01/17.
 */
public class CamelCaseTest {

    @Test
    public void testcase1() {
        CamelCase camelCase = new CamelCase();
        int count = camelCase.getWordsNumber("saveChangesInTheEditor");
        assertEquals(5, count);
    }
}
