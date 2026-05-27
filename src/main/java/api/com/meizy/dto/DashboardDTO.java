package api.com.meizy.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class DashboardDTO {

    private LocalDate dataRegistro;
    private BigDecimal lucroLiquido;
    private BigDecimal faturamentoBruto;
    private Integer totalVendas;
    private Integer novosClientes;
    private BigDecimal valorGasto;
    private String nomeProduto;

    public DashboardDTO() {}

    public DashboardDTO(LocalDate dataRegistro, BigDecimal lucroLiquido, BigDecimal faturamentoBruto,
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
