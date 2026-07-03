package ie.pt;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@EqualsAndHashCode
public class User {
    protected int id;
    protected String name;
    protected String email;
    protected boolean active;
}
