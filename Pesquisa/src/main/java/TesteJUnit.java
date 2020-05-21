import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.*;



public class TesteJUnit {
	
	
	String url = "http://www.bbc.com/portuguese/";
	Page pagina = new Page();
	WebDriver driver = pagina.driver;
	
	@Before
	public void setup() {
		try {
			System.out.println("Passei por aqui");
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
			System.out.println("Chrome driver iniciado com sucesso!");
			
			this.driver.get(url);
		}
		catch (Exception e) {
			System.out.println("Não foi possivel iniciar o ChromeDriver");
			e.printStackTrace();
		}
	}
	
	
	@Test
	
	//public void acessarPagina (){
		
		
		//pagina.getSecaoTecnologia().click();
		
		
	//}
	public void testeJUnit() {
		Assert.assertTrue("Não existe", pagina.getSecaoTecnologia().isDisplayed());
		
	}
	
	@After
	
	public void fecharDriver() {
		
		this.driver.close();
		
	}
	

}
