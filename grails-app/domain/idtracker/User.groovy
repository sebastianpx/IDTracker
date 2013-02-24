package idtracker

class User {

	String firstName
	String lastName
	String login
	String email
	String password
	
	
	static constraints = {
		firstName size: 2..15, blank: false, unique: false
		lastName size: 2..15, blank: false, unique: false
        login size: 5..15, blank: false, unique: true
        email email: true, blank: false
        password size: 5..15, blank: false
    }
	
}
