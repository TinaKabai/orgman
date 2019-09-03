package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class UserDemographyFactoryTest {

    @Test
    public void buildUserDemography() {

        Date dateobj = new Date();

        UserDemography userDemography = UserDemographyFactory.buildUserDemography("TinaKabai@absa.co.za",
                "Ms", "Female", "B2019B", dateobj);

        Assert.assertSame(userDemography.getGenderId(), userDemography.getGenderId());
    }
}