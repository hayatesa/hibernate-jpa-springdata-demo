package top.rsmzjp.main.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.rsmzjp.main.domain.DemoEntity;
import top.rsmzjp.main.repository.DemoRepository;
import top.rsmzjp.main.service.IDemoService;

import java.util.List;

@Service
@Transactional
public class DemoServiceImpl implements IDemoService {

    @Autowired
    private DemoRepository demoRepository;

    public void setDemoRepository(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<DemoEntity> findByName(String name) {
        return demoRepository.findByName(name);
    }

    @Override
    public void save(DemoEntity entity) {
        demoRepository.save(entity);
    }

    @Override
    public void deleteById(String id) {
        demoRepository.deleteById(id);
    }

    @Override
    public void findById(String id) {
        demoRepository.findById(id);
    }
}
