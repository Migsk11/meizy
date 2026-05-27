package api.com.meizy.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "Dashboard")
public class Dashboard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_registro", nullable = false)
    private LocalDate dataRegistro;

    @Column(name = "lucro_liquido", nullable = false, precision = 10, scale = 2)
    private BigDecimal lucroLiquido;

    @Column(name = "faturamento_bruto", nullable = false, precision = 10, scale = 2)
    private BigDecimal faturamentoBruto;

    @Column(name = "total_vendas", nullable = false)
    private Integer totalVendas;

    @Column(name = "novos_clientes", nullable = false)
    private Integer novosClientes;

    @Column(name = "valor_gasto", nullable = false, precision = 10, scale = 2)
    private BigDecimal valorGasto;

    @Column(name = "nome_produto", nullable = false, length = 255)
    private String nomeProduto;

    public Dashboard() {}

    public Dashboard(LocalDate dataRegistro, BigDecimal lucroLiquido, BigDecimal faturamentoBruto,
                     Integer totalVendas, Integer novosClientes,
                     BigDecimal valorGasto, String nomeProduto) {
        this.dataRegistro = dataRegistro;
        this.lucroLiquido = lucroLiquido;
        this.faturamentoBruto = faturamentoBruto;
        this.totalVendas = totalVendas;
        this.novosClientes = novosClientes;
        this.valorGasto = valorGasto;
        this.nomeProduto = nomeProduto;
    }

    public Long getId() { return id; }

    public LocalDate getDataRegistro() { return dataRegistro; }
    public void setDataRegistro(LocalDate dataRegistro) { this.dataRegistro = dataRegistro; }

    public BigDecimal getLucroLiquido() { return lucroLiquido; }
    public void setLucroLiquido(BigDecimal lucroLiquido) { this.lucroLiquido = lucroLiquido; }

    public BigDecimal getFaturamentoBruto() { return faturamentoBruto; }
    public void setFaturamentoBruto(BigDecimal faturamentoBruto) { this.faturamentoBruto = faturamentoBruto; }

    public Integer getTotalVendas() { return totalVendas; }
    public void setTotalVendas(Integer totalVendas) { this.totalVendas = totalVendas; }

    public Integer getNovosClientes() { return novosClientes; }
    public void setNovosClientes(Integer novosClientes) { this.novosClientes = novosClientes; }

    public BigDecimal getValorGasto() { return valorGasto; }
    public void setValorGasto(BigDecimal valorGasto) { this.valorGasto = valorGasto; }

    public String getNomeProduto() { return nomeProduto; }
    public void setNomeProduto(String nomeProduto) { this.nomeProduto = nomeProduto; }
}
