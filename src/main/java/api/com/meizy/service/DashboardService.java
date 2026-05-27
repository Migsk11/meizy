package api.com.meizy.service;

import api.com.meizy.dto.DashboardDTO;
import api.com.meizy.entity.Dashboard;
import api.com.meizy.repository.DashboardRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DashboardService {

    private final DashboardRepository dashboardRepository;

    public DashboardService(DashboardRepository dashboardRepository) {
        this.dashboardRepository = dashboardRepository;
    }

    public Dashboard salvar(DashboardDTO dto) {
        Dashboard dashboard = new Dashboard(
                dto.getDataRegistro(),
                dto.getLucroLiquido(),
                dto.getFaturamentoBruto(),
                dto.getTotalVendas(),
                dto.getNovosClientes(),
                dto.getValorGasto(),
                dto.getNomeProduto()
        );
        return dashboardRepository.save(dashboard);
    }

    public Optional<Dashboard> buscarPorId(Long id) {
        return dashboardRepository.findById(id);
    }
}
