package loja_virtual_mentoria;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.jdbc.core.JdbcTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.sql.DataSource;
import java.sql.SQLException;


@Service
public class BancoService {

    private static final Logger logger = LoggerFactory.getLogger(BancoService.class);

    @Autowired
    private DataSource dataSource;

    public void verificarConexao() {
        try {
            if (dataSource.getConnection() != null) {
                logger.info("Conexão com o banco de dados estabelecida com sucesso!");
            }
        } catch (SQLException e) {
            logger.error("Erro ao conectar ao banco de dados: {}", e.getMessage());
        }
    }
}