import com.yang.factory.ServiceFactory;
import com.yang.pojo.Hero;
import com.yang.service.HeroService;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

public class TestJdbc {
    @Test
    public void testQuert() throws SQLException {
        HeroService service = ServiceFactory.getHeroServiceInstance();
        List<Hero> list = service.queryAll();
//        System.out.println(list);
        list.forEach(h->{
            System.out.println(h);
        });

    }
}
