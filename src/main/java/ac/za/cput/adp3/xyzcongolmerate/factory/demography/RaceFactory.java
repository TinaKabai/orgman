package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import ac.za.cput.adp3.xyzcongolmerate.util.Helper;

public class RaceFactory {

    private static final String SUFFIX = Helper.getSuffixFromClassName(RaceFactory.class);

    public static Race buildRace(String raceDescription, String raceID) {
        return new Race.Builder().raceDescription(raceDescription).raceId(raceID).build();
    }
}
