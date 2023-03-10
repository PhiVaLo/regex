package bfst2023.handins.model;

import java.util.regex.Pattern;

public class Address {
        public final String street, house, floor, side, postcode, city;
    
      private Address(
          String _street, String _house, String _floor, String _side, 
          String _postcode, String _city) {
        street = _street;
        house = _house;
        floor = _floor;
        side = _side;
        postcode = _postcode;
        city = _city;
      }
    
      public String toString() {
        return street + " " + house + ", " + floor + " " + side + "\n"
          + postcode + " " + city;
      }
      
      // private final static String REGEX = "^(?<street>[A-Za-zæøå ]+?) +(?<house>[0-9]+)([, ]+(?<postcode>[0-9]{4}) +(?<city>[A-Za-zæøå ]+))?$";
      private final static String REGEX = "^(?<street>([2-8]|10)?[a-zA-ZæøåÆØÅé. ]+) (?<house>\\d+[A-Z]?), ((?<floor>st.|kl.|[0-9]{0,2}.) (?<side>th|tv|mf|\\d{1,2}|[a-z][1-9]{1,2}), )?(?<additionalCity>[^,]+, )?(?<postcode>\\d{4}) (?<city>[a-zA-ZæøåÆØÅé. ]+)$";
      private final static Pattern PATTERN = Pattern.compile(REGEX);
    
      public static Address parse(String input) {
            var builder = new Builder();
            var matcher = PATTERN.matcher(input);
            if (matcher.matches()) {
              builder.street(matcher.group("street"));
              builder.house(matcher.group("house"));
              builder.floor(matcher.group("floor"));
              builder.side(matcher.group("side"));
              builder.postcode(matcher.group("postcode"));
              builder.city(matcher.group("city"));
            }
            return builder.build();

        
      }
    
    
      public static class Builder {
        private String street, house, floor, side, postcode, city;
    
        public Builder street(String _street) {
          street = _street;
          return this;
        }
    
        public Builder house(String _house) {
          house = _house;
          return this;
        }
    
        public Builder floor(String _floor) {
          floor = _floor;  
          return this;
        }
    
        public Builder side(String _side) {
          side = _side;
          return this;
        }
    
        public Builder postcode(String _postcode) {
          postcode = _postcode;
          return this;
        }
    
        public Builder city(String _city) {
          city = _city;
          return this;
        }
        public Address build() {
          return new Address(street, house, floor, side, postcode, city);
        }  
        
      }
    
      

}
