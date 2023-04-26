package com.example.demo.service;

import com.example.demo.dao.DeviceRepository;
import com.example.demo.dao.EvaluationRepository;
import com.example.demo.dto.MultiColumnChartDTO;
import com.example.demo.dto.PieChartDTO;
import com.example.demo.entity.Evaluation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EvaluationService {

    @Autowired
    EvaluationRepository evaluationRepository;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    DeviceRepository deviceRepository;

    public String createEvaluation(Evaluation evaluation) {
        Evaluation save = evaluationRepository.save(evaluation);
        deviceRepository.addEvaluationId(save.getId(), evaluation.getDeviceId());
        return "Kayıt Başarılı!";
    }

    public Evaluation getEvaluationById(Integer id) {
        Evaluation byId = evaluationRepository.getById(id);
        return byId;
    }

    public List<Evaluation> getAllEvaluations() {
        return evaluationRepository.findAll();
    }

    public List<PieChartDTO> getEvaluateChart() {
        String sql = "SELECT ROUND(AVG(step1Question1), 0) as step1Question1, \n" +
                "ROUND(AVG(step1Question2), 0) as step1Question2, \n" +
                "ROUND(AVG(step1Question3), 0) as step1Question3, \n" +
                "ROUND(AVG(step1Question4), 0) as step1Question4, \n" +
                "ROUND(AVG(step1Question5), 0) as step1Question5, \n" +
                "ROUND(AVG(step2Question1), 0) as step2Question1, \n" +
                "ROUND(AVG(step2Question2), 0) as step2Question2, \n" +
                "ROUND(AVG(step2Question3), 0) as step2Question3, \n" +
                "ROUND(AVG(step2Question4), 0) as step2Question4, \n" +
                "ROUND(AVG(step2Question5), 0) as step2Question5, \n" +
                "ROUND(AVG(step2Question6), 0) as step2Question6, \n" +
                "ROUND(AVG(step3Question1), 0) as step3Question1, \n" +
                "ROUND(AVG(step3Question2), 0) as step3Question2, \n" +
                "ROUND(AVG(step3Question3), 0) as step3Question3, \n" +
                "ROUND(AVG(step3Question4), 0) as step3Question4, \n" +
                "ROUND(AVG(step3Question5), 0) as step3Question5, \n" +
                "ROUND(AVG(step3Question6), 0) as step3Question6, \n" +
                "ROUND(AVG(step3Question7), 0) as step3Question7, \n" +
                "ROUND(AVG(step3Question8), 0) as step3Question8 \n" +
                "FROM phonedb.evaluation;";
        Evaluation evaluation = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Evaluation.class));

        List<PieChartDTO> chartDTOList = new ArrayList<PieChartDTO>();

        PieChartDTO chartDTO = new PieChartDTO();
        chartDTO.setLabel("Yazılımı kullanırken zorlandınız mı?");
        chartDTO.setValue(evaluation.getStep1Question1().toString());
        PieChartDTO chartDTO2 = new PieChartDTO();
        chartDTO2.setLabel("Yazılımın ara yüzü basit ve kullanıcı dostu muydu?");
        chartDTO2.setValue(evaluation.getStep1Question2().toString());
        PieChartDTO chartDTO3 = new PieChartDTO();
        chartDTO3.setLabel("Yazılımı yardım almadan kullanabildiniz mi?");
        chartDTO3.setValue(evaluation.getStep1Question3().toString());
        PieChartDTO chartDTO4 = new PieChartDTO();
        chartDTO4.setLabel("Yazılımdan sağlanan yardım ihtiyacınıza cevap vermiş midir?");
        chartDTO4.setValue(evaluation.getStep1Question4().toString());
        PieChartDTO chartDTO5 = new PieChartDTO();
        chartDTO5.setLabel("Programı kullanırken kaldığınız yerden devam, kayıt veya çıkış konularında sorun yaşadınız mı?");
        chartDTO5.setValue(evaluation.getStep1Question5().toString());

        PieChartDTO chartDTO6 = new PieChartDTO();
        chartDTO6.setLabel("Yazılımın yönlendirmeleri açık mıydı?");
        chartDTO6.setValue(evaluation.getStep2Question1().toString());
        PieChartDTO chartDTO7 = new PieChartDTO();
        chartDTO7.setLabel("Yazılımın genelini anlama konusunda sorun yaşadınız mı?");
        chartDTO7.setValue(evaluation.getStep2Question2().toString());
        PieChartDTO chartDTO8 = new PieChartDTO();
        chartDTO8.setLabel("Yazılımın kullanımına ilişkin başlık, yönlendirme, metinler gibi verilen bilgiler yeterli miydi?");
        chartDTO8.setValue(evaluation.getStep2Question3().toString());
        PieChartDTO chartDTO9 = new PieChartDTO();
        chartDTO9.setLabel("Yazılımdaki metinlerde dilbilgisi ve anlam açısından bir sorunla karşılaştınız mı?");
        chartDTO9.setValue(evaluation.getStep2Question4().toString());
        PieChartDTO chartDTO10 = new PieChartDTO();
        chartDTO10.setLabel("Yazılımın genel tasarımı (renk, renklerin uyumu, yazı tipi) ile ilgili bir sorun tespit ettiniz mi?");
        chartDTO10.setValue(evaluation.getStep2Question5().toString());
        PieChartDTO chartDTO11 = new PieChartDTO();
        chartDTO11.setLabel("Kullanım kılavuzu ve ipuçları yeterli miydi?");
        chartDTO11.setValue(evaluation.getStep2Question6().toString());

        PieChartDTO chartDTO12 = new PieChartDTO();
        chartDTO12.setLabel("Yazılımın kullanılması sürecin hızlandırılmasına katkı sağladı mı?");
        chartDTO12.setValue(evaluation.getStep3Question1().toString());
        PieChartDTO chartDTO13 = new PieChartDTO();
        chartDTO13.setLabel("Yazılımın kullanılması mobil cihaz imaj alma sürecine katkı sağladı mı?");
        chartDTO13.setValue(evaluation.getStep3Question2().toString());
        PieChartDTO chartDTO14 = new PieChartDTO();
        chartDTO14.setLabel("Yazılımın kullanılması sırasında önerilen adımlar doğru şekilde sizi yönlendirdi mi?");
        chartDTO14.setValue(evaluation.getStep3Question3().toString());
        PieChartDTO chartDTO15 = new PieChartDTO();
        chartDTO15.setLabel("Yazılımın kullanılması sırasında önerilen adımlar size katkı sağladı mı?");
        chartDTO15.setValue(evaluation.getStep3Question4().toString());
        PieChartDTO chartDTO16 = new PieChartDTO();
        chartDTO16.setLabel("Yazılımın kullanılması sırasında önerilen adımlar mobil cihaz adli bilişimi sürecini kolaylaştırdı mı?");
        chartDTO16.setValue(evaluation.getStep3Question5().toString());
        PieChartDTO chartDTO17 = new PieChartDTO();
        chartDTO17.setLabel("Yazılımda önerilen adımların nasıl yapılacağı anlaşılır mıydı?");
        chartDTO17.setValue(evaluation.getStep3Question6().toString());
        PieChartDTO chartDTO18 = new PieChartDTO();
        chartDTO18.setLabel("Bu yazılımın genel olarak iş yükünü hafifleteceğini düşünüyor musunuz?");
        chartDTO18.setValue(evaluation.getStep3Question7().toString());
        PieChartDTO chartDTO19 = new PieChartDTO();
        chartDTO19.setLabel("Yeni başlayan personelin bu yazılımdan faydalanabileceğini düşünüyor musunuz?");
        chartDTO19.setValue(evaluation.getStep3Question8().toString());

        chartDTOList.add(chartDTO);
        chartDTOList.add(chartDTO2);
        chartDTOList.add(chartDTO3);
        chartDTOList.add(chartDTO4);
        chartDTOList.add(chartDTO5);
        chartDTOList.add(chartDTO6);
        chartDTOList.add(chartDTO7);
        chartDTOList.add(chartDTO8);
        chartDTOList.add(chartDTO9);
        chartDTOList.add(chartDTO10);
        chartDTOList.add(chartDTO11);
        chartDTOList.add(chartDTO12);
        chartDTOList.add(chartDTO13);
        chartDTOList.add(chartDTO14);
        chartDTOList.add(chartDTO15);
        chartDTOList.add(chartDTO16);
        chartDTOList.add(chartDTO17);
        chartDTOList.add(chartDTO18);
        chartDTOList.add(chartDTO19);

        return chartDTOList;
    }
}