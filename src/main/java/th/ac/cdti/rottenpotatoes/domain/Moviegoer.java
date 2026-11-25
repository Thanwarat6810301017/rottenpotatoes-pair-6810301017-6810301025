
package th.ac.cdti.rottenpotatoes.domain;

public record Moviegoer(String name, String email) {

    public Moviegoer {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be blank");
        }

        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email must contain @");
        }
    }
}
