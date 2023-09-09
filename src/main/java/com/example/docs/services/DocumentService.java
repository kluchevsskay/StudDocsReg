package com.example.docs.services;

import com.example.docs.models.Document;
import com.example.docs.repositories.DocumentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class DocumentService {
//    private List<Document> documents = new ArrayList<>();
//    private long ID = 0;
//
//    {
//        documents.add(new Document(++ID,
//                "алина",
//                "васильева",
//                215778,
//                "итиабд",
//                "сх",
//                "01.01.01"));
//    }

    private final DocumentRepository documentRepository;

    public List<Document> listDocuments(String num) {
        List<Document> documents = documentRepository.findAll();
        if (num != null) return documentRepository.findByNum(num);
        return documentRepository.findAll();
    }

    public void saveDocument(Document document) {
        log.info("Saving new {}", document);
//        document.setId(++ID);
        documentRepository.save(document);
    }

    public void deleteDocument(Long id) {

        documentRepository.deleteById(id);
    }

    public Document getDocumentById(Long id) {
        return documentRepository.findById(id).orElse(null);
    }
}

