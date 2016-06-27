import org.junit.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AgedBrieTest {

    private String AGED_BRIE = "Aged Brie";

    @Test
    public void when_whe_update_the_day_aged_brie_should_be_increased() throws Exception {
        Item item = new Item(AGED_BRIE,2,0);
        GildedRose gildedRose = new GildedRose(asList(item));

        gildedRose.updateQuality();

        assertThat(item.getSellIn(),is(1));
        assertThat(item.getQuality(),is(1));
    }
}
