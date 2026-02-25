package com.example.hostelAllotment.controller;

import com.example.hostelAllotment.model.dto.*;
import com.example.hostelAllotment.service.*;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    private UserService userService;

    @Autowired
    private RoomAllotmentService roomAllotmentService;

    @Autowired
    private MaintenanceService maintenanceService;

    @Autowired
    private NotificationService notificationService;

    @Autowired
    private ReportService reportService;

    // ---------- DASHBOARD ----------
    @GetMapping("/ui/dashboard")
    public String showDashboard() {
        return "dashboard";
    }

    // ---------- USER ----------
    @GetMapping("/ui/allusers")
    public String getAllUsers(Model model) {
        List<UserDto> users = userService.getUsers();
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/ui/createUser")
    public String showCreateUserForm(Model model) {
        model.addAttribute("user", new UserDto());
        return "create-user";
    }

    @PostMapping("/ui/createUser")
    public String submitCreateUser(@ModelAttribute UserDto userDto) {
        userService.createUser(userDto);
        return "redirect:/ui/allusers";
    }

//    @PostMapping("/ui/updateUser/{id}/{name}")
//    public String updateUser(@PathVariable Integer id, @PathVariable String name) {
//        userService.updateUser(id, name);
//        return "redirect:/ui/allusers";
//    }

    @GetMapping("/ui/deleteUser/{id}")
    public String deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);
        return "redirect:/ui/allusers";
    }

    // ---------- ROOM ALLOTMENT ----------
    @GetMapping("/ui/allallotments")
    public String getAllAllotments(Model model) {
        List<AllotmentDto> allotments = roomAllotmentService.getAllotments();
        model.addAttribute("allotments", allotments);
        return "allotments";
    }

    @GetMapping("/ui/createAllotment")
    public String showCreateAllotmentForm(Model model) {
        model.addAttribute("allotment", new AllotmentDto());
        return "create-allotment";
    }

    @PostMapping("/ui/createAllotment")
    public String submitCreateAllotment(@ModelAttribute AllotmentDto allotmentDto) {
        roomAllotmentService.createAllotment(allotmentDto);
        return "redirect:/ui/allallotments";
    }

//    @PostMapping("/ui/updateAllotment/{id}/{status}")
//    public String updateAllotment(@PathVariable Integer id, @PathVariable String status) {
//        roomAllotmentService.updateAllotment(id, status);
//        return "redirect:/ui/allallotments";
//    }

    @GetMapping("/ui/deleteAllotment/{id}")
    public String deleteAllotment(@PathVariable Integer id) {
        roomAllotmentService.deleteAllotment(id);
        return "redirect:/ui/allallotments";
    }

    // ---------- MAINTENANCE ----------
    @GetMapping("/ui/allmaintenances")
    public String getAllMaintenances(Model model) {
        List<MaintenanceDto> maintenances = maintenanceService.getMaintenances();
        model.addAttribute("maintenances", maintenances);
        return "maintenances";
    }

    @GetMapping("/ui/createMaintenance")
    public String showCreateMaintenanceForm(Model model) {
        model.addAttribute("maintenance", new MaintenanceDto());
        return "create-maintenance";
    }

    @PostMapping("/ui/createMaintenance")
    public String submitCreateMaintenance(@ModelAttribute MaintenanceDto maintenanceDto) {
        maintenanceService.createMaintenance(maintenanceDto);
        return "redirect:/ui/allmaintenances";
    }

//    @PostMapping("/ui/updateMaintenance/{id}/{status}")
//    public String updateMaintenance(@PathVariable Integer id, @PathVariable String status) {
//        maintenanceService.updateMaintenance(id, status);
//        return "redirect:/ui/allmaintenances";
//    }

    @GetMapping("/ui/deleteMaintenance/{id}")
    public String deleteMaintenance(@PathVariable Integer id) {
        maintenanceService.deleteMaintenance(id);
        return "redirect:/ui/allmaintenances";
    }

    // ---------- NOTIFICATIONS ----------
    @GetMapping("/ui/allnotifications")
    public String getAllNotifications(Model model) {
        List<NotificationDto> notifications = notificationService.getNotifications();
        model.addAttribute("notifications", notifications);
        return "notifications";
    }

    @GetMapping("/ui/createNotification")
    public String showCreateNotificationForm(Model model) {
        model.addAttribute("notification", new NotificationDto());
        return "create-notification";
    }

    @PostMapping("/ui/createNotification")
    public String submitCreateNotification(@ModelAttribute NotificationDto notificationDto) {
        notificationService.createNotification(notificationDto);
        return "redirect:/ui/allnotifications";
    }

//    @PostMapping("/ui/updateNotification/{id}/{isRead}")
//    public String updateNotification(@PathVariable Integer id, @PathVariable Boolean isRead) {
//        notificationService.updateNotification(id, isRead);
//        return "redirect:/ui/allnotifications";
//    }

    @GetMapping("/ui/deleteNotification/{id}")
    public String deleteNotification(@PathVariable Integer id) {
        notificationService.deleteNotification(id);
        return "redirect:/ui/allnotifications";
    }

    // ---------- REPORT ----------
    @GetMapping("/ui/allreports")
    public String getAllReports(Model model) {
        List<ReportDto> reports = reportService.getReports();
        model.addAttribute("reports", reports);
        return "reports";
    }

    @GetMapping("/ui/createReport")
    public String showCreateReportForm(Model model) {
        model.addAttribute("report", new ReportDto());
        return "create-report";
    }

    @PostMapping("/ui/createReport")
    public String submitCreateReport(@ModelAttribute ReportDto reportDto) {
        reportService.createReport(reportDto);
        return "redirect:/ui/allreports";
    }

//    @PostMapping("/ui/updateReport/{id}/{filePath}")
//    public String updateReport(@PathVariable Integer id, @PathVariable String filePath) {
//        reportService.updateReport(id, filePath);
//        return "redirect:/ui/allreports";
//    }

    @GetMapping("/ui/deleteReport/{id}")
    public String deleteReport(@PathVariable Integer id) {
        reportService.deleteReport(id);
        return "redirect:/ui/allreports";
    }
//    @GetMapping("/ui/dashboard")
//    public String Dashboard(HttpSession session, Model model) {
//        if (session.getAttribute("UserId") == null) {
//            return "redirect:/login";
//        }
//        return "dashboard";
//    }
}
