import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ArticlelistComponent } from './articlelist/articlelist.component';
import {AddaricelComponent} from './addaricel/addaricel.component';
import {EditarticleComponent} from './editarticle/editarticle.component'
const routes: Routes = [{path:'', component:ArticlelistComponent},
{path:'addaricle', component:AddaricelComponent},
{path:'updatearticle', component:EditarticleComponent },


{path:'updatearticle/:idarticle', component:EditarticleComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
