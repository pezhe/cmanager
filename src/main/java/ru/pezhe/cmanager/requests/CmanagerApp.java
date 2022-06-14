package ru.pezhe.cmanager.requests;

import ru.pezhe.cmanager.requests.entity.Request;
import ru.pezhe.cmanager.requests.entity.RequestOption;
import ru.pezhe.cmanager.requests.service.IdProvider;
import ru.pezhe.cmanager.requests.service.PublicServiceProvider;
import ru.pezhe.cmanager.requests.service.RequestTypeProvider;

public class CmanagerApp {

    public static void main(String[] args) {

        Request createdRequest = Request.builder()
                .id(IdProvider.getNewId())
                .requestorId("some_id_1")
                .apartmentId("some_id_2")
                .service(PublicServiceProvider.getInstance().getByName("stub_service"))
                .type(RequestTypeProvider.getInstance().getByName("stub_type"))
                .description("Problem description")
                .option(new RequestOption(IdProvider.getNewId(), "option_1").addValue("some_value"))
                .build();

        System.out.println(createdRequest);
    }

}
