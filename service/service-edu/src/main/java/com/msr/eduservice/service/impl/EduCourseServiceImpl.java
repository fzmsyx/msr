package com.msr.eduservice.service.impl;

import com.msr.eduservice.entity.EduCourse;
import com.msr.eduservice.entity.EduCourseDescription;
import com.msr.eduservice.entity.vo.CourseInfoForm;
import com.msr.eduservice.mapper.EduCourseMapper;
import com.msr.eduservice.service.EduCourseDescriptionService;
import com.msr.eduservice.service.EduCourseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.msr.servicebase.exception.MSRException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 课程 服务实现类
 * </p>
 *
 * @author msr
 * @since 2020-04-24
 */
@Service
public class EduCourseServiceImpl extends ServiceImpl<EduCourseMapper, EduCourse> implements EduCourseService {
    @Autowired
    private EduCourseDescriptionService courseDescriptionService;

    @Autowired
    private EduCourseService courseService;


    @Override
    public String saveCourseInfo(CourseInfoForm courseInfoForm) {

        //保存课程基本信息
        EduCourse course = new EduCourse();
        course.setStatus(EduCourse.COURSE_DRAFT);
        BeanUtils.copyProperties(courseInfoForm, course);
        boolean resultCourseInfo = this.save(course);
        if(!resultCourseInfo){
            throw new MSRException(20001, "课程信息保存失败");
        }

        //保存课程详情信息
        EduCourseDescription courseDescription = new EduCourseDescription();
        courseDescription.setDescription(courseInfoForm.getDescription());
        courseDescription.setId(course.getId());
        boolean resultDescription = courseDescriptionService.save(courseDescription);
        if(!resultDescription){
            throw new MSRException(20001, "课程详情信息保存失败");
        }

        return course.getId();
    }

    @Override
    public CourseInfoForm getCourseInfoFormById(String id) {
        System.out.println(id);

        EduCourse course = this.getById(id);
        if(course == null){
            throw new MSRException(20001, "数据不存在");
        }
        CourseInfoForm courseInfoForm = new CourseInfoForm();
        BeanUtils.copyProperties(course, courseInfoForm);

        EduCourseDescription courseDescription = courseDescriptionService.getById(id);
        if(course != null){
            courseInfoForm.setDescription(courseDescription.getDescription());
        }

        return courseInfoForm;
    }

    @Override
    public void updateCourseInfoById(CourseInfoForm courseInfoForm) {
        //保存课程基本信息
        EduCourse course = new EduCourse();
        BeanUtils.copyProperties(courseInfoForm, course);
        boolean resultCourseInfo = this.updateById(course);
        if(!resultCourseInfo){
            throw new MSRException(20001, "课程信息保存失败");
        }

        //保存课程详情信息
        EduCourseDescription courseDescription = new EduCourseDescription();
        courseDescription.setDescription(courseInfoForm.getDescription());
        courseDescription.setId(course.getId());
        boolean resultDescription = courseDescriptionService.updateById(courseDescription);
        if(!resultDescription){
            throw new MSRException(20001, "课程详情信息保存失败");
        }
    }
}
