/*
 * Copyright 2020 Sergio Belda
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sergiobelda.androidtodometer.di

import com.sergiobelda.androidtodometer.persistence.ProjectDao
import com.sergiobelda.androidtodometer.persistence.ProjectTaskViewDao
import com.sergiobelda.androidtodometer.persistence.TaskDao
import com.sergiobelda.androidtodometer.repository.ProjectRepository
import com.sergiobelda.androidtodometer.repository.ProjectTaskViewRepository
import com.sergiobelda.androidtodometer.repository.TaskRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object RepositoryModule {

    @Provides
    fun provideTaskRepository(taskDao: TaskDao) = TaskRepository(taskDao)

    @Provides
    fun provideProjectRepository(projectDao: ProjectDao) = ProjectRepository(projectDao)

    @Provides
    fun provideProjectTaskViewRepository(projectTaskViewDao: ProjectTaskViewDao) = ProjectTaskViewRepository(projectTaskViewDao)
}
