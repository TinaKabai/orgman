package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.util.Helper;

public class GenderFactory {

    private static final String SUFFIX = Helper.getSuffixFromClassName(GenderFactory.class);


    public static Gender buildGender(String genderDescription, String genderID) {

        return new Gender.Builder().genderDescription(genderDescription).genderId(genderID).build();
    }
}
