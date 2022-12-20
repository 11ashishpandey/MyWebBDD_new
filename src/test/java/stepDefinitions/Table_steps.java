package stepDefinitions;

import io.cucumber.java.en.*;
import pageobjects.Table_PO;

public class Table_steps {

    Table_PO ojj_table_po = new Table_PO();

    @Given("user is on table page")
    public void user_is_on_table_page() {
    ojj_table_po.navigate_to_table_page();
    }
    @When("user finds the heading {string} in the table page")
    public void user_finds_the_heading_in_the_table_page(String text) {
        ojj_table_po.find_the_text(text);
    }

    @Given("user {string} present in the page")
    public void user_present_in_the_page(String string) {

    }
    @Given("user {string} age is {string}")
    public void user_age_is(String string, String string2) {

    }

    @Given("user is on pagination {string}")
    public void user_is_on_pagination(String pagination_number) {
        ojj_table_po.validate_thepagination(pagination_number);

    }
//    @When("user finds the heading {string} in the table page just for test")
//    public void user_finds_the_heading_in_the_table_page_just_for_test(String string) {
//       ojj_table_po.validatefisstnameheading(string);
//    }
    @When("user finds the heading {string} in the {string}")
    public void user_finds_the_heading_in_the(String text, String locatorname) {
        ojj_table_po.validatefisstnameheading(text,locatorname);
    }


}
