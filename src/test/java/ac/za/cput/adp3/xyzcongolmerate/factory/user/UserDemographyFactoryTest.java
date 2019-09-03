package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Assert;
import org.junit.Test;
import sun.util.calendar.BaseCalendar;

import java.time.Instant;
import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {

    @Test
    public void buildUserDemography() {

        BaseCalendar.Date bdate = null;
        Date dateobj = new Date();
        System.out.println(bdate.setNormalizedDate(1998, 09, 18).format(dateobj));

        UserDemography userDemography = UserDemographyFactory.buildUserDemography("TinaKabai@absa.co.za",
                "Ms", "Female", "B2019B", '18:9:1998');
    }
}