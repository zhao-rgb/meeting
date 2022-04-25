package com.example.meeting.controller;

import com.example.meeting.Repository.MeetingsRepository;
import com.example.meeting.entity.Meetings;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author zhao
 * @className MeetingsController
 * @Description TODO
 * @Date 2022/4/18
 * @Version 1.0
 **/
@Controller
@Slf4j
public class MeetingsController {
    @Autowired
    private MeetingsRepository meetingsRepository;

    @RequestMapping("/")
    public String index() {
        return "redirect:/list";
    }

    @RequestMapping("/list")
    public String list(Model model) {
        List<Meetings> meetings = meetingsRepository.findAll();
        model.addAttribute("meetings", meetings);
        return "/meeting/list";
    }

    @RequestMapping("/toAdd")
    public String toAdd() {
        return "meeting/add";
    }

    @RequestMapping("/add")
    public String add(Meetings meetings) {
        meetingsRepository.save(meetings);
        return "redirect:/list";
    }

    @RequestMapping("/toEdit")
    public String toEdit(Model model,Integer id) {
        Meetings meetings = meetingsRepository.getById(id);
        model.addAttribute("meetings", meetings);
        return "meeting/edit";
    }

    @RequestMapping("/edit")
    public String edit(Meetings meetings) {
        meetingsRepository.save(meetings);
        return "redirect:/list";
    }


    @RequestMapping("/delete")
    public String delete(Integer id) {
        meetingsRepository.deleteById(id);
        return "redirect:/list";
    }

    @RequestMapping("/select")
    public String select(Model model,Integer id) {
        Meetings select = meetingsRepository.getById(id);
        model.addAttribute("select",select);
        return "/meeting/list";
    }

//    @GetMapping("/getAllMerchantInfo")
//    public List<Meetings> getAllMerchantInfo(){
//        List<Meetings> merchantInfoList = meetingsRepository.findAll();
//        log.info("打印所有商户列表:{}",merchantInfoList);
//        return merchantInfoList;
//    }
}
