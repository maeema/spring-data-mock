package com.mmnaseri.utils.spring.data.domain.impl;

import com.mmnaseri.utils.spring.data.domain.RepositoryMetadata;
import com.mmnaseri.utils.spring.data.sample.models.Person;
import com.mmnaseri.utils.spring.data.sample.repositories.AnnotatedInheritingRepository;
import com.mmnaseri.utils.spring.data.sample.repositories.SampleAnnotatedRepository;
import com.mmnaseri.utils.spring.data.sample.repositories.SimplePersonRepository;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

/**
 * @author Milad Naseri (m.m.naseri@gmail.com)
 * @since 1.0 (4/10/16)
 */
public class DefaultRepositoryMetadataResolverTest {

    @Test
    public void testThatItResolvesUsingAnnotations() {
        final RepositoryMetadata metadata = new DefaultRepositoryMetadataResolver().resolveFromInterface(
                SampleAnnotatedRepository.class);
        assertThat(metadata, is(notNullValue()));
    }

    @Test
    public void testThatItResolvesUsingInheritance() {
        final RepositoryMetadata metadata = new DefaultRepositoryMetadataResolver().resolveFromInterface(
                SimplePersonRepository.class);
        assertThat(metadata, is(notNullValue()));
    }

    @Test
    public void testThatAnnotationTakesPrecedenceOverInheritance() {
        final RepositoryMetadata metadata = new DefaultRepositoryMetadataResolver().resolveFromInterface(
                AnnotatedInheritingRepository.class);
        assertThat(metadata, is(notNullValue()));
        assertThat(metadata.getEntityType(), is(Matchers.equalTo(Person.class)));
    }

}