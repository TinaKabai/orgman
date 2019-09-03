package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {


    @Test
    public void buildOrganisationUser() {

        OrganisationUser organisationUser = OrganisationUserFactory.buildOrganisationUser("14000A",
                "TinaKabai@absa.co.za");

        Assert.assertEquals(organisationUser.getUserEmail(), organisationUser.getUserEmail());
    }
}