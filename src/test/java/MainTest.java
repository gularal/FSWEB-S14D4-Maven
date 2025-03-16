import org.example.model.Bread;
import org.example.model.Chocolate;
import org.example.model.Coke;
import org.example.model.ProductForSale;
import org.example.rpg.Monster;
import org.example.rpg.Troll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(ResultAnalyzer.class)
public class MainTest {

    ProductForSale bread;
    ProductForSale chocolate;
    ProductForSale coke;
    Monster troll;

    @BeforeEach
    void setUp() {
        bread = new Bread("Test", 10, "Test Bread");
        chocolate = new Chocolate("Test", 10, "Test Chocolate");
        coke = new Coke("Test", 10, "Test Coke");
        troll = new Troll("Shrek", 1000, 100);
    }

    @DisplayName("Subclasslar Superclass değişkenlerinin değerlerine ulaşabiliyor mu?")
    @Test
    public void testProductForSaleAccessModifiers() {
        assertEquals("Test", bread.getType());
        assertEquals(10, bread.getPrice());
        assertEquals("Test Bread", bread.getDescription());

        assertEquals("Test", chocolate.getType());
        assertEquals(10, chocolate.getPrice());
        assertEquals("Test Chocolate", chocolate.getDescription());
    }

    @DisplayName("Tüm sınıflar doğru sınıftan türüyorlar mı?")
    @Test
    public void testClassInheritance() {
        assertThat(bread, instanceOf(ProductForSale.class));
        assertThat(chocolate, instanceOf(ProductForSale.class));
        assertThat(coke, instanceOf(ProductForSale.class));
    }

    @DisplayName("getSalesPrice doğru sonuçlar üretiyor mu?")
    @Test
    public void testGetSalesPrice() {
        assertEquals(30, bread.getSalesPrice(3));
        assertEquals(50, chocolate.getSalesPrice(5));
        assertEquals(40, coke.getSalesPrice(4));
    }

    @DisplayName("showDetails metodu tanımlanmış mı ve public mi?")
    @Test
    public void testShowDetails() throws NoSuchMethodException {
        Method showDetailsMethod = bread.getClass().getDeclaredMethod("showDetails");
        assertEquals(Modifier.PUBLIC, showDetailsMethod.getModifiers() & Modifier.PUBLIC);
    }

    @DisplayName("Troll sınıfı doğru değişken tiplerine sahip mi?")
    @Test
    public void testTrollDataTypes() {
        assertThat(troll.getName(), instanceOf(String.class));
        assertThat(troll.getHitPoints(), instanceOf(Integer.class));


        assertEquals(100.0, troll.getDamage());

        assertEquals("Shrek", troll.getName());
        assertEquals(1000, troll.getHitPoints());
    }

    @DisplayName("attack metodu doğru çalışıyor mu?")
    @Test
    public void testAttackMethod() {
        assertEquals(155.0, troll.attack());
    }
}
