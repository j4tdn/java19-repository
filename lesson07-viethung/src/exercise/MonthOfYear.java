package exercise;

public enum MonthOfYear
{
    January("January", 0), 
    February("February", 1), 
    March("March", 2), 
    April("April", 3), 
    May("May", 4), 
    June("June", 5), 
    July("July", 6), 
    August("August", 7), 
    September("September", 8), 
    October("October", 9), 
    November("November", 10), 
    December("December", 11);
    
    private MonthOfYear(final String name, final int ordinal) {
    }
}