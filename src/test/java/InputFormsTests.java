import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static pageObjets.MainMobilePage.mainMobilePage;
import static pageObjets.MainWebPage.mainPage;
import static pageObjets.PrizesPage.prizesPage;

public class InputFormsTests extends TestBase {

    @BeforeEach
    public void setUpProxy() {
    }

    @Test
    @DisplayName("Заполнение и отправка мобильной формы в футере")
    public void footerFormMobileTest() {
        setUpMobileSize();
        mainMobilePage.checkFooterForm();
    }

    @Test
    @DisplayName("Заполнение и отправка формы на розыгрыш")
    public void prizeFormTest() throws InterruptedException {
        prizesPage.checkPrizeForm();
    }

    @Test
    @DisplayName("Заполнение и отправка формы на 3 бесплатных пробных занятия")
    public void getFreeClassesFormTest() {
        mainPage.checkGetFreeClassesForm();
    }

}
