import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class WebsiteTitleTest extends BaseTest {

    @ParameterizedTest
    @DisplayName(TestNamesProvider.SII_PORTAL)
    @ValueSource(strings = TitlesProvider.SII_PORTAL)
    @Tag(TagsProvider.REGRESSION)
    @Tag(TagsProvider.SII_PORTAL)
    void checkTitleForSiiPortal(String expectedTitle) {
        driver.get(BaseURL.SII_PORTAL);
        driver.manage().window().maximize();
        assertThat(driver.getTitle()).isEqualTo(expectedTitle);
    }

    @ParameterizedTest
    @DisplayName(TestNamesProvider.ONET)
    @ValueSource(strings = TitlesProvider.ONET)
    @Tag(TagsProvider.REGRESSION)
    @Tag(TagsProvider.ONET)
    void checkTitleForOnet(String expectedTitle) {
        driver.get(BaseURL.ONET);
        driver.manage().window().maximize();
        assertThat(driver.getTitle()).isEqualTo(expectedTitle);
    }

    @ParameterizedTest
    @DisplayName(TestNamesProvider.KOTUSZKOWO)
    @ValueSource(strings = TitlesProvider.KOTUSZKOWO)
    @Tag(TagsProvider.REGRESSION)
    @Tag(TagsProvider.KOTUSZKOWO)
    void checkTitleForKotuszkowo(String expectedTitle) {
        driver.get(BaseURL.KOTUSZKOWO);
        driver.manage().window().maximize();
        assertThat(driver.getTitle()).isEqualTo(expectedTitle);
    }

    @ParameterizedTest
    @DisplayName(TestNamesProvider.FILMWEB)
    @ValueSource(strings = TitlesProvider.FILMWEB)
    @Tag(TagsProvider.REGRESSION)
    @Tag(TagsProvider.FILMWEB)
    void checkTitleForFilmweb(String expectedTitle) {
        driver.get(BaseURL.FILMWEB);
        driver.manage().window().maximize();
        assertThat(driver.getTitle()).isEqualTo(expectedTitle);
    }

    @ParameterizedTest
    @DisplayName(TestNamesProvider.SELENIUM)
    @ValueSource(strings = TitlesProvider.SELENIUM)
    @Tag(TagsProvider.REGRESSION)
    @Tag(TagsProvider.SELENIUM)
    void checkTitleForSeleniumDocumentation(String expectedTitle) {
        driver.get(BaseURL.SELENIUM);
        driver.manage().window().maximize();
        assertThat(driver.getTitle()).isEqualTo(expectedTitle);
    }
}
