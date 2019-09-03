package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import org.junit.Assert;
import org.junit.Test;

public class GenderFactoryTest {


    @Test
    public void buildGender() {

        Gender gender = GenderFactory.buildGender("Female", "F2019F");

        Assert.assertSame(gender.getGenderDescription(), gender.getGenderDescription());
        //System.out.println(GenderFactory());
    }
}