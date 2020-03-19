package CS544.finalProject.backEnd.services.impl;

import CS544.finalProject.backEnd.controllers.BlockController;
import CS544.finalProject.backEnd.controllers.CourseController;
import CS544.finalProject.backEnd.models.Block;
import CS544.finalProject.backEnd.models.Course;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
class BlockServiceImplTest {


    @InjectMocks
    BlockController courseController;

    private MockMvc mockMvc;

    @Mock
    BlockServiceImpl blockService;

    private Block block = new Block();
    private List<Block> blockList = new ArrayList<>();


    @BeforeEach
    void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(courseController).build();
        block.setId(1L);
        block.setBlockSequence(1);
        block.setCode("20");
        block.setEndDate(new Date());
        block.setStartDate(new Date());
        block.setName("Data");
        block.setSemester("Spring");
        blockList.add(block);
    }

    @Test
    void save() {
        when(blockService.save(block)).thenReturn(block);
        assertEquals(block, blockService.save(block));
    }

    @Test
    void update() {

        try {
            when(blockService.update(block)).thenReturn(block);
            assertEquals(block, blockService.update(block));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    void findAll() {

        when(blockService.findAll()).thenReturn(blockList);
        assertEquals(1, blockService.findAll().size());

    }

    @Test
    void findById() {
        try {
            when(blockService.findById(1L).get()).thenReturn(block);
            assertEquals(block, blockService.findById(1L).get());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}