package api.com.meizy.controller;

import api.com.meizy.dto.DashboardDTO;
import api.com.meizy.entity.Dashboard;
import api.com.meizy.service.DashboardService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {

    private final DashboardService dashboardService;

    public DashboardController(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @PostMapping
    public ResponseEntity<Dashboard> salvar(@RequestBody DashboardDTO dto) {
        Dashboard dashboard = dashboardService.salvar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(dashboard);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dashboard> buscarPorId(@PathVariable Long id) {
        return dashboardService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
