package ProiectFinal.proiect.model.dal.repository;

import ProiectFinal.proiect.model.dal.dao.Notebook;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NotebookRepository extends JpaRepository<Notebook, Long> {

    Notebook getByNotebookId(Long notebookId);
}
