import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class WebsiteTitleTest extends BaseTest {

    @ParameterizedTest
    @ValueSource(strings = TitlesProvider.SII_PORTAL)
    @DisplayName(TestNames.SII_PORTAL)
    @Tag("regression")
    @Tag("siiPortal")
    void checkTitleForSiiPortal(String expectedTitle) {
        driver.get(BaseURL.SII_PORTAL);
        driver.manage().window().maximize();
        assertThat(driver.getTitle()).isEqualTo(expectedTitle);
    }

    @ParameterizedTest
    @ValueSource(strings = TitlesProvider.ONET)
    @DisplayName(TestNames.ONET)
    @Tag("regression")
    @Tag("onet")
    void checkTitleForOnet(String expectedTitle) {
        driver.get(BaseURL.ONET);
        driver.manage().window().maximize();
        assertThat(driver.getTitle()).isEqualTo(expectedTitle);
    }

    @ParameterizedTest
    @ValueSource(strings = TitlesProvider.KOTUSZKOWO)
    @DisplayName(TestNames.KOTUSZKOWO)
    @Tag("regression")
    @Tag("kotuszkowo")
    void checkTitleForKotuszkowo(String expectedTitle) {
        driver.get(BaseURL.KOTUSZKOWO);
        driver.manage().window().maximize();
        assertThat(driver.getTitle()).isEqualTo(expectedTitle);
    }

    @ParameterizedTest
    @ValueSource(strings = TitlesProvider.FILMWEB)
    @DisplayName(TestNames.FILMWEB)
    @Tag("regression")
    @Tag("filmweb")
    void checkTitleForFilmweb(String expectedTitle) {
        driver.get(BaseURL.FILMWEB);
        driver.manage().window().maximize();
        assertThat(driver.getTitle()).isEqualTo(expectedTitle);
    }

    @ParameterizedTest
    @ValueSource(strings = TitlesProvider.SELENIUM)
    @DisplayName(TestNames.SELENIUM)
    @Tag("regression")
    @Tag("selenium")
    void checkTitleForSeleniumDocumentation(String expectedTitle) {
        driver.get(BaseURL.SELENIUM);
        driver.manage().window().maximize();
        assertThat(driver.getTitle()).isEqualTo(expectedTitle);
    }
}
