package org.mytests.tests.example;

import org.mytests.uiobjects.example.entities.User;
import org.mytests.uiobjects.example.site.sections.HeaderMenu;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Step;

import static org.mytests.uiobjects.example.site.JDIExampleSite.homePage;
import static org.mytests.uiobjects.example.site.JDIExampleSite.login;
import static org.mytests.uiobjects.example.site.JDIExampleSite.metalAndColorsPage;

public class CheckUserCanSubmitMetalAndColorPage extends CheckUserCanSubmitMetalAndColorPageInit {

    @Step ("Login on JDI site as User")
    @Test
    public void loginAsUser() {
        HeaderMenu header = new HeaderMenu();
        homePage.open();
        login(new User());
        homePage.checkOpened();
        header.openMetalAndColors();
        metalAndColorsPage.checkOpened();
    }

    }

