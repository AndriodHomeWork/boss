package com.itcast.bos.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.itcast.bos.domain.base.FixedArea;

/**  
 * ClassName:fixedAreaService <br/>  
 * Function:  <br/>  
 * Date:     2018年3月21日 下午9:03:53 <br/>       
 */
public interface FixedAreaService {


    void save(FixedArea fixedArea);

    Page<FixedArea> findAll(Pageable pageable);

    void associationCourierToFixedArea(Long fixedAreaId, Long courierId, Long takeTimeId);

    void assignSubAreas2FixedArea(Long id, Long[] subAreaIds);

}
  
