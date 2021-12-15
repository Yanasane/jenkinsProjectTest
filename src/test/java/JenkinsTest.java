import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.Assert;
import org.junit.Test;

@Epic("EpicName")
@Story("StoryName")
@Owner("Aboba")
public class JenkinsTest {

    @Test
    @Description("Тест 1")
    public void test1() {
        Assert.assertEquals("Равные числа", 1, 1);
    }

    @Test
    @Description("Тест 2")
    public void test2() {
        Assert.assertNotEquals("НЕ Равные числа", 2, 1);
    }

    @Test
    @Description("Тест 3")
    public void test3() {
        Assert.assertEquals("Упал", 5, 1);
    }
}
