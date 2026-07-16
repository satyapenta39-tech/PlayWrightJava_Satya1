package TestPackage;

import java.util.regex.Pattern;

import org.testng.annotations.Test;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import basetest.BaseTest;

public class LoginTest2 extends BaseTest {
	
	@Test
	public void test() {
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).click();
		page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).fill("satya");
		page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).click();
		page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).fill("12345");
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
		page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).click();
		page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Username")).fill("Admin");
		page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).click();
		page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).fill("admin123");
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
		page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Search")).click();
		page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Search")).click();
		page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Search")).fill("work");
		page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Search")).click();
		page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Search")).fill("");
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Admin")).click();
		page.getByRole(AriaRole.TEXTBOX).nth(1).click();
		page.getByRole(AriaRole.TEXTBOX).nth(1).fill("satya");
		page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^-- Select --$"))).nth(2)
				.click();
		page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Admin")).click();
		page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Type for hints...")).click();
		page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Type for hints..."))
				.fill("employee Name");
		page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^-- Select --$"))).nth(2)
				.click();
		page.getByRole(AriaRole.LISTBOX).getByText("Enabled").click();
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Reset")).click();
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(" Add")).click();
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save")).click();
	}

}
