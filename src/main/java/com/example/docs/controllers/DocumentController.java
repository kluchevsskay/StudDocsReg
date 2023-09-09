package com.example.docs.controllers;

import com.example.docs.models.Document;
import com.example.docs.services.DocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class DocumentController {
    private final DocumentService documentService;

    @GetMapping("/")
    public String documents(@RequestParam(name = "num", required = false) String num, Model model) {
        model.addAttribute("documents", documentService.listDocuments(num));
        return "documents";
    }

    @GetMapping("/document/{id}")
    public String documentInfo(@PathVariable Long id, Model model) {
        model.addAttribute("document", documentService.getDocumentById(id));
        return "document-info";
    }

    @PostMapping("/document/create")
    public String documentInfo(Document document) {
        documentService.saveDocument(document);
        return "redirect:/";
    }

    @PostMapping("/document/delete/{id}")
    public String deleteDocument(@PathVariable Long id) {
        documentService.deleteDocument(id);
        return "redirect:/";
    }
}
