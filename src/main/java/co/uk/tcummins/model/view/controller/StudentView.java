package co.uk.tcummins.model.view.controller;

/**
 * Created by Tom on 20/09/2016.
 */
public class StudentView
{
    public void printStudentDetails( String studentName, String studentRollNo )
    {
        System.out.println( "Student: " );
        System.out.println( "Name: " + studentName );
        System.out.println( "Roll No: " + studentRollNo );
    }
}
