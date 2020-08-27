import { Component, OnInit } from '@angular/core';
import {NgForm} from '@angular/forms';
import {NgserviceService} from '../ngservice.service' ; 
import {Article} from '../article';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addaricel',
  templateUrl: './addaricel.component.html',
  styleUrls: ['./addaricel.component.css']
})
export class AddaricelComponent implements OnInit {
article = new Article(); 
  constructor(private _route : Router , private _service: NgserviceService) { }

  ngOnInit(): void {
  }
  addarticlefromsubmit(){
    this._service.addArticle(this.article).subscribe (
      data=>{
        console.log("data added");
        this._route.navigate(['']);   
    }
    
    )

  }
 
  back(){
    this._route.navigate(['']); 
  }
  
}
