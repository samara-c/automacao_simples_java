import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Page {
	WebDriver driver = new FirefoxDriver();
	
	private WebElement secaoTecnologia = driver.findElement(By.linkText("Tecnologia"));

	public WebElement getSecaoTecnologia() {
		return secaoTecnologia;
	}

	public void setSecaoTecnologia(WebElement caixaDePesquisa) {
		this.secaoTecnologia = caixaDePesquisa;
	}
	
	

}
