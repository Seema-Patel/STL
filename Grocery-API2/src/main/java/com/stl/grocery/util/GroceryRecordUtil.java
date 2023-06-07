package com.stl.grocery.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Component;

import com.stl.grocery.entity.Grocery;
@Component
public class GroceryRecordUtil {

    public static Grocery parseGroceryRecord(CSVRecord record) {
        try {
            String memberNumber = record.get("Member_number");
            Date date = new SimpleDateFormat("dd-MM-yyyy").parse(record.get("Date"));
            String itemDescription = record.get("itemDescription");
            String username = record.get("username");
            Date creationDate = new SimpleDateFormat("dd-MM-yyyy").parse(record.get("creationDate"));

            return new Grocery(memberNumber, date, itemDescription, username, creationDate);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }

}
}
