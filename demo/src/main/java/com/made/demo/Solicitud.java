@Entity
public class Solicitud {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numeroSolicitud;
    private String respuesta;
    private LocalDateTime fecha;
    // Getters y Setters
}
