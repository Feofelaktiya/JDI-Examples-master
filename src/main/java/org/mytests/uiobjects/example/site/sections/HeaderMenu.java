package org.mytests.uiobjects.example.site.sections;

import com.epam.jdi.uitests.web.selenium.elements.complex.Tabs;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import org.mytests.uiobjects.example.enums.HeaderOptions;
import org.openqa.selenium.support.FindBy;

import static org.mytests.uiobjects.example.enums.HeaderOptions.HEADER_OPTIONS;


public class HeaderMenu extends Section {
    @FindBy(css = ".uui-navigation > li")
    public Tabs<HeaderOptions> navigation;

    public void openMetalAndColors() {
        navigation.select(HEADER_OPTIONS.metalsAndColors);


    }
}
