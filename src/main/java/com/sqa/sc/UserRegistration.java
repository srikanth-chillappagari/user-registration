/**
 * File Name: UserRegistration.java<br>
 * Chillappagari, Srikanth<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Oct 10, 2016
 */
package com.sqa.sc;

import com.sqa.sc.helpers.*;

/**
 * UserRegistration //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Chillappagari, Srikanth
 * @version 1.0.0
 * @since 1.0
 */
public class UserRegistration {

	private static int[] ages;

	private static char[] gender;

	private static String[] jobTitles;

	private static String[] names;

	public static void main(String[] args) {
		int usersCount = RequestInput.getInt("How many user you would like to enter");
		names = new String[usersCount];
		ages = new int[usersCount];
		gender = new char[usersCount];
		jobTitles = new String[usersCount];
		for (int i = 0; i < usersCount; i++) {
			System.out.println("User details for user" + (i + 1));
			names[i] = RequestInput.getString("Could I get user " + (i + 1) + "'s name :");
			ages[i] = RequestInput.getInt("how old is " + names[i] + ":");
			gender[i] = RequestInput.getChar("Is this person Male or Female :", 'M', 'F');
			if (gender[i] == 'M') {
				jobTitles[i] = RequestInput.getString("what does he do for living :");
			} else {
				jobTitles[i] = RequestInput.getString("what does she do for living :");
			}
		}
		for (int i = 0; i < usersCount; i++) {
			System.out.println("user :" + names[i]);
			System.out.println("\t" + gender[i] + "," + ages[i]);
			System.out.println("\t jobTitle:" + jobTitles[i]);
		}
	}
}