import org.junit.Test;
import org.junit.Ignore;

import static org.junit.Assert.assertEquals;

public class OcrNumbersTest {

    @Test
    public void recognizes_0()
    {
        var rows =
                " _ \n" +
                "| |\n" +
                "|_|\n" +
                "   ";
        var actual = OcrNumbers.Convert(rows);
        assertEquals("0", actual);
    }

	@Ignore	
    @Test
    public void recognizes_1()
    {
        var rows =
            "   \n" +
            "  |\n" +
            "  |\n" +
            "   ";
        var actual = OcrNumbers.Convert(rows);
        assertEquals("1", actual);
    }

	@Ignore	
    @Test
    public void unreadable_but_correctly_sized_inputs_return_()
    {
        var rows =
            "   \n" +
            "  _\n" +
            "  |\n" +
            "   ";
        var actual = OcrNumbers.Convert(rows);
        assertEquals("?", actual);
    }

	@Ignore	
    @Test(expected = IllegalArgumentException.class)
    public void input_with_a_number_of_lines_that_is_not_a_multiple_of_four_raises_an_error()
    {
        var rows =
                " _ \n" +
                "| |\n" +
                "   ";

        OcrNumbers.Convert(rows);
    }

	@Ignore	
    @Test(expected = IllegalArgumentException.class)
    public void input_with_a_number_of_columns_that_is_not_a_multiple_of_three_raises_an_error()
    {
        var rows =
            "    \n" +
            "   |\n" +
            "   |\n" +
            "    ";

        OcrNumbers.Convert(rows);
    }

	@Ignore	
    @Test
    public void recognizes_110101100()
    {
        var rows =
            "       _     _        _  _ \n" +
            "  |  || |  || |  |  || || |\n" +
            "  |  ||_|  ||_|  |  ||_||_|\n" +
            "                           ";
        var actual = OcrNumbers.Convert(rows);
        assertEquals("110101100", actual);
    }

	@Ignore	
    @Test
    public void garbled_numbers_in_a_string_are_replaced_with_()
    {
        var rows =
                "       _     _           _ \n" +
                "  |  || |  || |     || || |\n" +
                "  |  | _|  ||_|  |  ||_||_|\n" +
                "                           ";

        var actual = OcrNumbers.Convert(rows);
        assertEquals("11?10?1?0", actual);
    }

	@Ignore	
    @Test
    public void recognizes_2()
    {
        var rows =
                " _ \n" +
                " _|\n" +
                "|_ \n" +
                "   ";

        var actual = OcrNumbers.Convert(rows);
        assertEquals("2", actual);
    }

	@Ignore	
    @Test
    public void recognizes_3()
    {
        var rows =
                " _ \n" +
                " _|\n" +
                " _|\n" +
                "   ";

        var actual = OcrNumbers.Convert(rows);
        assertEquals("3", actual);
    }

	@Ignore	
    @Test
    public void recognizes_4()
    {
        var rows =
                "   \n" +
                "|_|\n" +
                "  |\n" +
                "   ";

        var actual = OcrNumbers.Convert(rows);
        assertEquals("4", actual);
    }

	@Ignore	
    @Test
    public void recognizes_5()
    {
        var rows =
                " _ \n" +
                "|_ \n" +
                " _|\n" +
                "   ";

        var actual = OcrNumbers.Convert(rows);
        assertEquals("5", actual);
    }

	@Ignore	
    @Test
    public void recognizes_6()
    {
        var rows =
                " _ \n" +
                "|_ \n" +
                "|_|\n" +
                "   ";

        var actual = OcrNumbers.Convert(rows);
        assertEquals("6", actual);
    }

	@Ignore	
    @Test
    public void recognizes_7()
    {
        var rows =
                " _ \n" +
                "  |\n" +
                "  |\n" +
                "   ";

        var actual = OcrNumbers.Convert(rows);
        assertEquals("7", actual);
    }

	@Ignore	
    @Test
    public void recognizes_8()
    {
        var rows =
                " _ \n" +
                "|_|\n" +
                "|_|\n" +
                "   ";

        var actual = OcrNumbers.Convert(rows);
        assertEquals("8", actual);
    }

	@Ignore	
    @Test
    public void recognizes_9()
    {
        var rows =
                " _ \n" +
                "|_|\n" +
                " _|\n" +
                "   ";

        var actual = OcrNumbers.Convert(rows);
        assertEquals("9", actual);
    }

	@Ignore	
    @Test
    public void recognizes_string_of_decimal_numbers()
    {
        var rows =
            "    _  _     _  _  _  _  _  _ \n" +
            "  | _| _||_||_ |_   ||_||_|| |\n" +
            "  ||_  _|  | _||_|  ||_| _||_|\n" +
            "                              ";
        var actual = OcrNumbers.Convert(rows);
        assertEquals("1234567890", actual);
    }

	@Ignore	
    @Test
    public void numbers_separated_by_empty_lines_are_recognized_lines_are_joined_by_commas_()
    {
        var rows =
                "    _  _ \n" +
                        "  | _| _|\n" +
                        "  ||_  _|\n" +
                        "         \n" +
                        "    _  _ \n" +
                        "|_||_ |_ \n" +
                        "  | _||_|\n" +
                        "         \n" +
                        " _  _  _ \n" +
                        "  ||_||_|\n" +
                        "  ||_| _|\n" +
                        "         ";
        var actual = OcrNumbers.Convert(rows);
        assertEquals("123,456,789", actual);
    }
}
