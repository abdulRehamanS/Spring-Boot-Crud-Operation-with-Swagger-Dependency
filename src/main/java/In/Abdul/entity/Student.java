package In.Abdul.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "spring boot crud operation")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue
    @Column(name = "Id", nullable = false)

    private Integer id;
    @Column(name = "Name", nullable = false)

    private String name;
    @Column(name = "Designation", nullable = false)
    private String designated;
}
