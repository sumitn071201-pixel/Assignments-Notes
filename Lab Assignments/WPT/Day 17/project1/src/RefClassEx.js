import { Component, createRef } from "react"

export default class RefClassEx extends Component
{
    constructor()
    {
        super()
        this.refv = createRef()
    }
    render()
    {
        return(
            <div>
                <h1>Reference Class</h1>
                <input type="text" ref={this.refv} />
                <input type="button" value="show" onClick={()=>{console.log(this.refv.current.value)}} />
            </div>
        )
    }
}