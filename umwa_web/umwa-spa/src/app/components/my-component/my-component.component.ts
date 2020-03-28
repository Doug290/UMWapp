import { Component, OnInit } from '@angular/core';
import { MyServiceService } from '../my-service.service';

@Component({
  selector: 'app-my-component',
  templateUrl: './my-component.component.html',
  styleUrls: ['./my-component.component.css']
})
export class MyComponentComponent implements OnInit {

  constructor(private myService: MyServiceService) { }

  ngOnInit() {
  }

  public test() {
    this.myService.getTest().subscribe((result: any) => {
      console.log(result);
    });
  }

}
